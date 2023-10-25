fun main(args: Array<String>) {
    var result = calculateBugMentions(listOf("BUG","LOP","C#GOVNO","HTML","CSS","JS","Java","BUG"));
    println(result)
}

fun calculateBugMentions(words:List<String>):Int{
    var sumBug = 0;
    for(i in words){
        if(i=="BUG"){
            sumBug +=1;
        }
    }
    return sumBug ;
}