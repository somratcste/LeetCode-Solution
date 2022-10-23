class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>(n);
        
        for (int i = 1; i <= n; i++) {
            if (i%5 == 0 & i%3 == 0) {
                result.add("FizzBuzz");
                continue;
            } else if (i%3 == 0) {
                result.add("Fizz");
                continue;
            } else if (i%5 == 0) {
                result.add("Buzz"); 
                continue;
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result; 
    }
}