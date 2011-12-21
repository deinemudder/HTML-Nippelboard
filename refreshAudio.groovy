File dir = new File("./audio")
String json = null
dir.eachFile{ f ->
	if(json!=null){
		json+=","
	}
	else {
		json = "var audios=["
	}
	String label=f.name.substring(0,f.name.lastIndexOf('.'))
	json+="{label:'${label}',path:'audio/${f.name}'}"
}
json += "]"
File out = new File('data.js')
out.write(json,'UTF8')
