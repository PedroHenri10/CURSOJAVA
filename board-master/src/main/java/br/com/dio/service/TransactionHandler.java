@AllArgsConstructor
public class TransactionHandler {

    private final Connection connection;

    public <T> T execute(TransactionalOperation<T> operation) {
        try {
            T result = operation.execute();
            connection.commit();
            return result;
        } catch (RuntimeException | SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao realizar rollback", ex);
            }
            throw new RuntimeException(e);
        }
    }

    @FunctionalInterface
    public interface TransactionalOperation<T> {
        T execute() throws SQLException;
    }
}
