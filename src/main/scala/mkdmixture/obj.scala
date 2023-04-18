package mkdmixture

object obj {



  def main( args : Array[String]): Unit=

    {

      println("====Welcome to MKD Mixture===")


      val a = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)

      println("====Raw List=====")

      println(a)

      println()

      println("Need to number less than 10")

      val b =a.filter(  x => x  <10     )

      println(b)

      println()

      println(" Need to print values greater than 10")

      println(  a.filter(y  => y >10)      )




println("I have updated the code")






    }


}