$(document).ready(() =>{
    $.ajax({
        url:'http://localhost:8090/api/TipoCurso/all',
        type: 'GET',
        dataType: 'json',
        success: function(res){
let data ='';
res.forEach(element => {
    data+=`
    <tr>
    <td>${element.idTipoCurso}</td>
    <td>${element.categoriaCurso}</td>
    <tr>
    `
    
});
$('#tbody').html(data);

        }
    })

   
})