// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.HashMap;

class Solution {
   Solution() {
   }

   public int[] twoSum(int[] var1, int var2) {
      HashMap var3 = new HashMap();

      for(int var4 = 0; var4 < var1.length; ++var4) {
         int var5 = var2 - var1[var4];
         if (var3.containsKey(var5)) {
            return new int[]{(Integer)var3.get(var5), var4};
         }

         var3.put(var1[var4], var4);
      }

      return new int[0];
   }
}
