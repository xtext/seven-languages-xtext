package org.xtext.builddsl.lib

abstract class BuildScript {
	
	public static int OK = 0
	public static int HELP = 1
	public static int ERROR = 2
	public static int WRONG_PARAM = 3
	
	def protected String getScriptName()
	
	def protected String[] getParameterNames()
	
	def protected String[] getTaskNames()
	
	def Class<?> getParameterType(String name) {
		val field = getClass.getField(name)
		field.type
	}
	
	def protected int doBuild(String[] args) throws Throwable
	
	def protected int build(String[] args) {
		try {
			return doBuild(args)
		} catch(Throwable throwable) {
			println
			throwable.printStackTrace
			return ERROR
		}
	}
	
	def showHelp(String[] args) {
		if (args.empty || args.exists [ arg | "--help" == arg || "-h" == arg]) {
			println('''
				Build '«scriptName»'
				
				Tasks:
					«FOR task: taskNames»
						«task»
					«ENDFOR»
					
				«IF !parameterNames.nullOrEmpty»
					Parameters:
						«FOR it: parameterNames»
							--«it» <«parameterType.simpleName»>
						«ENDFOR»
				«ENDIF»
			''')
			return true
		}
		return false
	}
	
}