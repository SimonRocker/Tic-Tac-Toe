fun main(args: Array<String>) {
	val firstArg = args[0].toBoolean()
	var truemessage: String = "Hier stand nie etwas anstößiges"
	var falsemessage: String = "Hier auch nicht"
		if (firstArg) {
			for (i in 1..1000) {
			println(truemessage)
			}
				}
			else {
				for (i in 1..1000) {
					println(falsemessage)
				}
			}
				

}








