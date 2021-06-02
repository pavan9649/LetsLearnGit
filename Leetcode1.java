class Leetcode1{
    //String sb1="";
    String value(String s){
        String sb1="";
        for(int i=0;i<s.length();i++)
        {
            int l =(s.charAt(i))-97;
           sb1=sb1.concat(Integer.toString(l));
           //System.out.println(sb1);
            
        }
        System.out.println(sb1);
        return sb1;
    }
public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        boolean p=false;
         Integer a1=Integer.parseInt(value(firstWord));
        Integer a2=Integer.parseInt(value(secondWord));
        Integer a3=Integer.parseInt(value(targetWord));
        if((a1+a2)==a3)
        {
            p=true;
        }
            
        return p;
    }
     public static void main(String[] args) {
          Leetcode1 s1=new Leetcode1();
         boolean p=s1.isSumEqual(args[0],args[1],args[2]);
         System.out.println(p);

  }
    }