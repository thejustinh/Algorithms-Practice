public class Algorithms {

  public static void linearAlgorithm(long N) {
     for (long i = 1; i < N; i++) {
       long x = 1;
     }
   }

  public static void quadraticAlgorithm (long N) {
    for (long i = 1; i < N; i++) {
      for (long j = 1; j < N; j++) {
        long x = 1;
      }
    }
  }

  public static void cubicAlgorithm(long N) {
    for (long i = 1; i < N; i++) {
      for (long j = 1; j < N; j++) {
        for (long k = 1; k < N; k++) {
          long x = 1;
        }
      }
    }
  }

  public static void logarithmicAlgorithm(long N) {
    for (long i = N; i > 1; i = i / 2) {
      long x = 1;
    }
  }

  public static void NlongNAlgorithm(long N) {
    for (long i = 1; i < N; i++) {
      for (long j = N; j > 1; j = j / 2) {
        long x = 1;
      }
    }
  }
}
