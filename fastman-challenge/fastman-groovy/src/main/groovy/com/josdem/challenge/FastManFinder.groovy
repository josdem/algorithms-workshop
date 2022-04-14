package com.josdem.challenge

class FastManFinder {

    def dictionary = ['fast', 'fat', 'man', 'strong']

    def find(String keyword) {
        def result = []
        for(int i=0;i<keyword.length()-1;i++){
            for(int j=keyword.length();j!=i;j--){
                if(dictionary.contains(keyword.substring(i,j))){
                    result << "${keyword.substring(i,j)}"
                }
            }
        }
        result
    }
}
