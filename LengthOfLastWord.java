public int lengthOfLastWord(String s){
       String[] aList = s.trim().split(" ");
       ArrayList<String> myList = new ArrayList<>();
       myList.addAll(Arrays.asList(aList));
       int len = 0;
       if (myList.size()>0){
           len = myList.get(myList.size()-1).length();
       }
       return len;
    }