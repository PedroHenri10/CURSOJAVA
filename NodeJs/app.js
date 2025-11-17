 function buscarCEPv1(){
    const cep = document.getElementById('cep').value;
    const url = `https://viacep.com.br/ws/${cep}/json`;

    fetch(url)
    .then(response => {
        if (!response.ok){
            throw new Error('Erro na requisição: '+ response.status);
        }
        return response.json();
    })
    .then(data => {
        console.log(data);

        document.getElementById('resultado').innerText = JSON.stringify(data, null, 2);

        document.getElementById('cepResults').value = data.cep || "";
        document.getElementById('logadouro').value = data.logradouro || "";
        document.getElementById('complemento').value = data.complemento || "";
        document.getElementById('unidade').value = data.unidade || "";
        document.getElementById('bairro').value = data.bairro || "";
        document.getElementById('localidade').value = data.localidade || "";
        document.getElementById('uf').value = data.uf || "";
        document.getElementById('estado').value = data.estado || "";
        document.getElementById('regiao').value = data.regiao || "";            

        
    })
    .catch(error => {
        console.log('Erro:', error );
    });
}

function buscarCEPv2(){
    const cep = document.getElementById('cep').value;
    const url = `https://viacep.com.br/ws/${cep}/json`;
    
    const xhr = new XMLHttpRequest();
    xhr.open('GET', url, true);

    xhr.onload = function() {
        if(xhr.status === 200){
            const data = JSON.parse(xhr.responseText);
            console.log(data);
            document.getElementById('resultado').innerText = JSON.stringify(data, null, 2);
        }else{
            console.error('Erro na requisição:', xhr.status);
        }
    };

    xhr.onerror = function(){
        console.error('Erro de rede.');
    };
    xhr.send();
}