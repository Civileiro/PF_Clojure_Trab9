; Nome: Gabriel Prost Gomes Pereira

; Começando com o 3 porque será usado nos outros

; 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o elemento que está na posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 


(defn elementoN [xs n]
  (if (zero? n)
    (first xs)
    (recur (rest xs) (dec n))
  )
)


; 1. Utilizando a linguagem Clojure, crie uma função chamada ultimo que receba uma lista e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 


(defn ultimo [xs]
  (elementoN xs (dec (count xs)))
)

(println (ultimo '(3 2 1)))
(println (ultimo ["ola" "mundo" "!"]))


; 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e devolva o penúltimo elemento desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 


(defn penultimo [xs]
  (elementoN xs (- (count xs) 2))
)

(println (penultimo '(3 2 1)))
(println (penultimo ["ola" "mundo" "!"]))


; 4. Utilizando a linguagem Clojure, crie uma função chamada inverso que receba uma lista e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 


(defn inverso [xs]
  (loop [result '() lista xs]
    (if (empty? lista)
      result
      (recur (conj result (first lista)) (rest lista))
    )
  )
)

(println (inverso '(3 2 1)))
(println (inverso ["ola" "mundo" "!"]))


; 5. Utilizando a linguagem Clojure, crie uma função chamada mdc que receba dois inteiros e devolve o mínimo divisor comum entre eles. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure. 


(defn mdc [x y]
  (loop [a (max x y) b (min x y)]
    (if (zero? b) 
      a
      (recur b (mod a b))
    )
  )
)

(println (mdc 255 35))
(println (mdc 35 255))
(println (mdc 252 105))
(println (mdc 105 252))