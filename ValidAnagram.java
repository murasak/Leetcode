public boolean isAnagram(String s, String t) {
        char[] list1 = s.toCharArray();
        char[] list2 = t.toCharArray();
        Arrays.sort(list1);
        Arrays.sort(list2);
        boolean isValid = true;
        if (list1.length != list2.length)
        	isValid = false;
        else{
        	for (int i = 0; i< list1.length;  i++){
        		if (isValid)
        			isValid = list1[i]==list2[i];
        	}      	
        }
        return isValid;
    }