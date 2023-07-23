fun main() {
    print(
        "   ---Bienvenido a la miscelánea---" + "\n" +
                "Ingrese los números para acceder a algún programa" + "\n" +
                "1. Calcular el área de un triángulo" + "\n" +
                "2. Ingresar dos números por teclado y sumarlos.\n" +
                "3. Ingresar un número y visualizar el número elevado al cuadrado." + "\n" +
                "4. Conversor de euros a dólares." + "\n" +
                "5. Averiguar el perímetro de un cuadrado." + "\n" +
                "6. Determinar el área y el volúmen de un cilindro.\n" +
                "7. Determinar longitud y área de un círculo.\n" +
                "8. Calcular el promedio de tres (3) números.\n" +
                "9. Saber si un número es positivo o negativo.\n" +
                "10. Mayor o menor de dos números.\n" +
                "11. Imprimir el mayor y el menor de tres números positivos ingresados.\n" +
                "12. Si de los números A y B, A es menor, restarlos si A es mayor que B. sino, sumarlos.\n"+
                "13. Dividir.\n"+
                "14. Sumar negativos y multiplicar positivos\n" +
                "15. Saber si un año es bisiesto o no.\n"+
                "16. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.\n" +
                "17. Imprimir los números impares entre 0 y 100.\n" +
                "18. Imprimir los números pares del 1 al 100.\n" +
                "19. Saber los cuadrados del 1 al 30.\n" +
                "20. Sumar las potencias al cuadrado de los primeros 100 números naturales\n" +
                "21. Radio de números. Desde A hasta B.\n"+
                "22. Sumar todo lo que no sea 0\n" +
                        "99. SALIR\n" +
                ":  "
    )
    val pi = 3.1425
    var selection = readln().toInt()
    when (selection) {
        1 -> {
            println("Ingrése el valor de la base")
            val base = readln().toInt()
            println("Ingrése el valor de la altura")
            val height = readln().toInt()
            val result = (base * height) / 2
            println("El área de este triángulo es de: $result")
            println("Terminado...")
        }// end area triangulo
        2 -> {
            println("Dígite el primer número")
            val number1 = readln().toInt()
            println("Digite el segundo número")
            val number2 = readln().toInt()
            val sum = (number1 + number2)
            println("La suma de $number1 + $number2 da como resultado: $sum")
            println("Terminado...")
        }// end suma
        3 -> {
            println("Digíte el número que quiere elevar al cuadrado: ")
            val power = readln().toInt()
            val potency = (power * power)
            println("El resultado de la potencia de $power, es $potency")
            println("Terminado...")
        }// end potenciation
        4 -> {
            // 1 Euro equals to 1.12 Dollars
            println("¿Cuántos euros quiere convertir?")
            val euro = readln().toDouble()
            val dalla = 1.12
            val change = (euro * dalla)
            println("El intercambio de $euro Euros a Dólares es es $change")
            println("Terminado...")
        }// end euro change
        5 -> {
            println("Bienvenido. Ingrese el valor del lado del cuadrado: ")
            val side = readln().toInt()
            val perimeter = (side * 4)
            println("El valor del perímetro de este cuadrado es de $perimeter")
            println("Terminado...")
        }// end perimetro cuadrado
        6 -> {
            println("Voy a calcularle el área, y el volumen del cilindro")
            val pi = 3.1416
            println("Ingrese la altura del cilindro: ")
            val height = readln().toDouble()
            println("Ingrese el radio del cilindro: ")
            val ratio = readln().toDouble()
            val area = ((2 * pi) * (ratio * height)) + ((2 * pi) * (ratio * ratio))
            val volume = (pi * (ratio * ratio) * height)
            println("El área de este cilindro es $area y el volumen es $volume")

        }// end cilindro
        7 -> {
            println("Por favor ingrese el radio de la circunferencia: ")
            val radio = readln().toDouble()
            val area = (pi * 2) * radio
            val longitude = pi * (radio * radio)
            println("Este círculo tiene un área de $area, y una longitud de $longitude")
            println("Terminado...")
        }// end circulo
        8 -> {
            println("A continuación digíte los tres números a promediar: ")
            println("Primer número: ")
            val n1 = readln().toInt()
            println("Segundo número:")
            val n2 = readln().toInt()
            println("Tercer número:")
            val n3 = readln().toInt()
            val average = (n1 + n2 + n3) / 3
            println(
                "El promedio fue de $average\n" +
                        "Números ingresados:\n" +
                        "$n1\n" +
                        "$n2\n" +
                        "$n3"
            )
            println("Terminado...")
        }// end promedio
        9 -> {
            println("Ingrese el número: ")
            val pn = readln().toInt()
            if (pn > 0) {
                println("$pn es un número positivo")
            } else if (pn < 0) {
                println("$pn es un número negativo")
            } else if (pn == 0) {
                println("$pn es cero.")
            } else {
                println("WTF!!!")
            }
            println("Terminado...")
        }

        10 -> {
            println("Ingrese el primer número:")
            val first = readln().toInt()
            println("Ingrese el segundo número")
            val second = readln().toInt()
            if (first > second) {
                println("El primer dígito $first es mayor que el segundo $second")
            } else if (second > first) {
                println("El segundo dígito $second es mayor que el primero $first")
            } else if (first == second) {
                println("Ambos número son iguales $first")
            } else {
                println("WTF!!!")
            }
            println("Terminado...")
        }

        11 -> {
            println("Ingrese el primer número: ")
            val num1 = readln().toInt()
            println("Ingrese el segundo número: ")
            val num2 = readln().toInt()
            println("Ingrese el tercer número: ")
            val num3 = readln().toInt()
            if (num1 < 0 || num2 < 0 || num3 < 0) {
                println("Error, el número ingresado es negativo. Bye")
            } else if (((num1 > num2) && (num1 > num3) && (num2 < num3))) {
                println("El número mayor es $num1 y el número menor es $num2")
            } else if (((num1 > num2) && (num1 > num3) && (num3 < num2))) {
                println("El número mayor es $num1 y el número menor es $num3")
            } else if ((num2 > num1) && (num2 > num3) && (num1 < num3)) {
                println("El número mayor es $num2 y el número menor es $num1")
            } else if ((num2 > num1) && (num2 > num3) && (num3 < num1)) {
                println("El número mayor es $num2 y el número menor es $num3")
            } else if ((num3 > num1) && (num3 > num2) && (num1 < num2)){
                println("El número mayor es $num3 y el número menor es $num1")
            } else if((num3 > num1) && (num3 > num2) && (num2 < num1)){
                println("el número mayor es $num3 y el número menor es $num2")
            } else{
                println("WTF!!!")
            }
            println("Terminado...")
        }
        12 -> {
            println("Ingrese el valor para A: ")
            val a = readln().toInt()
            println("Ingrese el valor para B: ")
            val b = readln().toInt()
            if (a < b){
                val operation = a - b
                println("El resultado de la resta es de $operation")
            }else if (b > a){
                val operation = b + a
                println("El resultado de la suma es de $operation")
            }else{
                println("Los números son iguales")
            }
            println("Terminado...")
        }
        13 -> {
            println("Ingrese el dividendo (Número que va a dividir): ")
            val dividend = readln().toDouble()
            println("Ingrese el divisor (Cantidad por la cual se divide): ")
            val divider = readln().toDouble()
            if (divider.equals(0)){
                println("Espera. Dividir por $divider no es posible")
            }else {
                val division = (dividend / divider )
                println("El resultado de dividir $dividend por $divider arroja $division")
            }
            println("Terminado...")
        }
        14 -> {
            println("Ingrése el primer número")
            val ei = readln().toDouble()
            val bi = readln().toDouble()
            if ((ei < 0) || (bi < 0)){
                val result = ei + bi
                println("Al sumar $ei y $bi da como resultado: $result")
            }else{
                val result = ei * bi
                println("El resultado de mkultiplicar $ei y $bi es: $result")
            }
            println("Terminado...")
        }
        15 -> {
            println("Hola, te voy a ayudar a saber si un año es bisiesto")
            println("¿En que año te encuentras?")
            val year = readln().toInt()
            println("Cuantos días tiene Febrero de $year")
            val february = readln().toInt()
            if(february > 28){
                println("$year es un año bisiesto, El próximo año bisiesto será en 4 años ()")
            }else {
                println("$year no es un año bisiesto.")
            }
            }
        16 -> {
            println("Bienvenido, voy a imprimir los múltiplos de 3")
            for (i in 1..100){
                if (i % 3 == 0){
                    println("Ohhh, encontré un múltiplo de 3, es $i")
                }
        }
        }
        17 -> {
            println("Hola, te voy a mostrar todos lo impares del 1 al 100")
            for(i in 1..100){
                if (i % 2 == 1){
                    println("Ajá!!, te atrape impar $i")
                }
            }
        }
        18 -> {
            println("Hey!! Vamos a capturar números pares")
            for(i in 1..100){
                if (i % 2 == 0){
                    println("Tengo un par! $i")
                }
            }
        }
        19 -> {
            println("Descubramos esos números al cuadrado")
            for(i in 1..30){
                val square = i*i
                println("La potencia de al cuadrado de $i es $square")
            }
        }
        20 -> {
            println("Sumemos esos números. OK? Lets go!!")
            for (i in 1..100){
                val squareOps = i*i
                val power = squareOps + squareOps
                println("La potencia al cuadrado de $i es $squareOps. Suma total de las potencias $power")
            }
        }
        21 -> {
            println("Hola. ingrése el límite inferior: ")
            val limitI = readln().toInt()
            println("Ahora ingrése el límite superior: ")
            val limitS = readln().toInt()
            if (limitI < limitS){
                for (i in limitI..limitS){
                    println("$i")
                }
            }else{
                println("El primer número ingresado debe ser menor al segundo")
            }
            }
        22 -> {
            println("Hola, vamos a sumar los números mientras el valor no sea 0")
            var number = readln().toInt()
            var sum = 0
            while (number != 0){
                sum += number
                number = readln().toInt()
                println("Llevamos $sum")
            }
            println("El total acumulado fue: $sum")
        }
        99 -> {
            println("Cerrando programa... Terminado")
        }
        }
}
