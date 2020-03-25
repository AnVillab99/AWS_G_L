formulario = (function () {

    var url = "http://ec2-34-238-38-15.compute-1.amazonaws.com:4567/val"
    

    return {

        calcular: function(){

            let a =document.getElementById("value").value;
            console.log(a)
            axios(url, {
                method: 'POST',
                mode: 'no-cors',
                headers: {
                'Access-Control-Allow-Origin': '*',
                'Content-Type': 'application/json',
                },
                withCredentials: true,
                credentials: 'same-origin',
                data: {
                    val:":"+a+":"
                }
            })
            .then(function (response) {
                console.log("ok");
                document.getElementById("resultado").innerHTML = response.data;
                console.log(response);
            })
            .catch(function (error) {
                console.log("error");
                console.log(error)
                console.log(error.response);
            });

            


        }
    };





})();