//> using scala "2.13.8"

import Canicas._

// Casos de prueba para canicasPosiblesFrasco
val esperadoCPF1 = List((1, 0))
val obtenidoCPF1 = canicasPosiblesFrasco(1, 0)
assert(obtenidoCPF1 == esperadoCPF1)

val esperadoCPF2 = List((2, 0), (2, 1), (2, 2), (2, 3), (2, 4), (2, 5))
val obtenidoCPF2 = canicasPosiblesFrasco(2, 5)
assert(obtenidoCPF2 == esperadoCPF2)

val esperadoCPF3 = List((3, 0), (3, 1), (3, 2))
val obtenidoCPF3 = canicasPosiblesFrasco(3, 2)
assert(obtenidoCPF3 == esperadoCPF3)

val esperadoCPF4 = List((5, 0), (5, 1))
val obtenidoCPF4 = canicasPosiblesFrasco(5, 1)
assert(obtenidoCPF4 == esperadoCPF4)

val esperadoCPF5 = List((4, 0), (4, 1), (4, 2), (4, 3))
val obtenidoCPF5 = canicasPosiblesFrasco(4, 3)
assert(obtenidoCPF5 == esperadoCPF5)

// Casos de prueba para canicasPorFrasco
val esperadoCPFr1 = List(
  List((1, 0))
)
val obtenidoCPFr1 = canicasPorFrasco(1, 0)
assert(obtenidoCPFr1 == esperadoCPFr1)

val esperadoCPFr2 = List(
  List((1, 0), (1, 1), (1, 2))
)
val obtenidoCPFr2 = canicasPorFrasco(1, 2)
assert(obtenidoCPFr2 == esperadoCPFr2)

val esperadoCPFr3 = List(
  List((1, 0), (1, 1)),
  List((2, 0), (2, 1))
)
val obtenidoCPFr3 = canicasPorFrasco(2, 1)
assert(obtenidoCPFr3 == esperadoCPFr3)

val esperadoCPFr4 = List(
  List((1, 0)),
  List((2, 0)),
  List((3, 0))
)
val obtenidoCPFr4 = canicasPorFrasco(3, 0)
assert(obtenidoCPFr4 == esperadoCPFr4)

val esperadoCPFr5 = List(
  List((1, 0), (1, 1), (1, 2)),
  List((2, 0), (2, 1), (2, 2)),
  List((3, 0), (3, 1), (3, 2))
)
val obtenidoCPFr5 = canicasPorFrasco(3, 2)
assert(obtenidoCPFr5 == esperadoCPFr5)

// Casos de prueba para mezclarLCanicas
val esperadoMLC1 = List(Nil)
val obtenidoMLC1 = mezclarLCanicas(Nil)
assert(obtenidoMLC1 == esperadoMLC1)

val entradaMLC2 = List(
  List((1, 0), (1, 1))
)
val esperadoMLC2 = List(
  List((1, 0)),
  List((1, 1))
)
val obtenidoMLC2 = mezclarLCanicas(entradaMLC2)
assert(obtenidoMLC2 == esperadoMLC2)

val entradaMLC3 = List(
  List((1, 0), (1, 1)),
  List((2, 0), (2, 1))
)
val esperadoMLC3 = List(
  List((1, 0), (2, 0)),
  List((1, 0), (2, 1)),
  List((1, 1), (2, 0)),
  List((1, 1), (2, 1))
)
val obtenidoMLC3 = mezclarLCanicas(entradaMLC3)
assert(obtenidoMLC3 == esperadoMLC3)

val entradaMLC4 = canicasPorFrasco(2, 2)
val esperadoMLC4 = List(
  List((1, 0), (2, 0)),
  List((1, 0), (2, 1)),
  List((1, 0), (2, 2)),
  List((1, 1), (2, 0)),
  List((1, 1), (2, 1)),
  List((1, 1), (2, 2)),
  List((1, 2), (2, 0)),
  List((1, 2), (2, 1)),
  List((1, 2), (2, 2))
)
val obtenidoMLC4 = mezclarLCanicas(entradaMLC4)
assert(obtenidoMLC4 == esperadoMLC4)

val entradaMLC5 = List(
  List((1, 0), (1, 1)),
  List((2, 0)),
  List((3, 0), (3, 1))
)
val esperadoMLC5 = List(
  List((1, 0), (2, 0), (3, 0)),
  List((1, 0), (2, 0), (3, 1)),
  List((1, 1), (2, 0), (3, 0)),
  List((1, 1), (2, 0), (3, 1))
)
val obtenidoMLC5 = mezclarLCanicas(entradaMLC5)
assert(obtenidoMLC5 == esperadoMLC5)


