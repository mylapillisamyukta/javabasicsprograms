function calculate()
{
    var x=document.getElementById("no1").value;
    var y=document.getElementById("no2").value;
    var operator=document.getElementById("operator").value;
    if(operator == "+") 
    {
        var result=parseInt(x)+parseInt(y);
    }
    document.getElementById("result").value= result;
    if(operator == "-") 
    {
        var result=parseInt(x)-parseInt(y);
    }
    document.getElementById("result").value= result;
    if(operator == "*") 
    {
        var result=parseInt(x)*parseInt(y);
    }
    document.getElementById("result").value= result;
    if(operator == "/") 
    {
        var result=parseInt(x)/parseInt(y);
    }
    document.getElementById("result").value= result;
    }
