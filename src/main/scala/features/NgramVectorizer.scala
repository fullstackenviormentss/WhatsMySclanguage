package features
import breeze.linalg.SparseVector

class NgramVectorizer(char: Boolean, ngramRange: (Int, Int)) extends StatefulVectorizer {

  override def fit(corpus: Iterator[String]): Unit = {
    
  }

  override def vectorize(text: String): SparseVector[Double] = {

  }
}
