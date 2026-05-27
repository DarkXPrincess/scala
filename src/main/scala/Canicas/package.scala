//> using scala "2.13.8"
//1.1 Las canicas y los frascos
package object Canicas {
  type Frasco = (Int, Int)
  type Distr = List[Frasco]

//1.1.1 Canicas posibles en un frasco
  def canicasPosiblesFrasco(f: Int, c:Int):List[Frasco]={
    (for{
      k <- 0 to c
    }yield(f,k)).toList
  }

  //1.1.2 Canicas posibles por frasco
  def canicasPorFrasco(n:Int, c:Int):List[Distr]={
    (for{
      f <- 1 to n
    }yield canicasPosiblesFrasco(f,c)).toList
  }

  //1.1.3 Combinaciones de canicas por frasco
  def mezclarLCanicas(lc : List [ Distr ]): List [ Distr ] ={
    lc match {
      case Nil => List(Nil)
      case opcionesPrimerFrasco :: resto =>
        for{
          frasco <- opcionesPrimerFrasco
          distribucionResto <- mezclarLCanicas(resto)
        } yield frasco :: distribucionResto
    }
  }
  //1.1.4 Calculando las distribuciones requeridas
  def distribucion(m:Int , n:Int , c:Int ): List [ Distr ] = {
    for{
      d <- mezclarLCanicas(canicasPorFrasco(n,c))
      if d.map { case (_, canicas) => canicas }.sum == m
    } yield d
  }
  //1.2 Calculo de posibles agrupaciones crecientes
  def agrupaciones(m: Int ): List [ List [ Int ]] ={
    ???
  }
  }
