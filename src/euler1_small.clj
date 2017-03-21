(ns euler1)
(defn isMultipleOf3Or5 [x] (or (= 0 (rem x 5)) (= 0 (rem x 3))))
(println (reduce + (filter isMultipleOf3Or5 (range 1 1000))))