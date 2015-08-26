public boolean isPalindrome(String s) {
        boolean isPal = true;
        char[] aList = s.toCharArray();
        ArrayList<String> myList = new ArrayList<>();
        for (int i=0;i<aList.length;i++){
            if (Character.isLetter(aList[i]) || Character.isDigit(aList[i])){
                myList.add(aList[i]+"");
            }
        }
        for (int i=0;i<myList.size();i++){
            if (isPal){
                isPal = myList.get(i).equalsIgnoreCase(myList.get(myList.size()-1-i));
            }          
        }
        return isPal;
    }