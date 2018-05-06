app.factory('myFactory',function()
{
    var name="";
    return{
        setData:function(str){
            name = str;
        },
        getData:function(){
            return name;
        }
    }
})
