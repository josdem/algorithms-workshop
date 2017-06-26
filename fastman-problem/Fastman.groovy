class Fastman {

	def dictionary = ["fast","fat","man","strong"]

	private String find(String string){
		String result = ''

		if(string?.length() > 0){
			for(int i=0;i<string.length()-1;i++){
				for(int j=string.length();j!=i;j--){
					if(dictionary.contains(string.substring(i,j))){
						result += "${string.substring(i,j)} "
					}
				}
			}
			result
		}
	}

	static void main(String[] args){
		Fastman fastman = new Fastman()
		String result = fastman.find('fastman')
		assert 'fast man' == result.trim()
	}

}
