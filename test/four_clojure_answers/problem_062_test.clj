(ns four-clojure-answers.problem-062-test
  (:use four-clojure-answers.problem-062
        clojure.test))

(deftest problem-062-test
  (are [f x g expected]
    (= (g (answer f x)) expected)
    #(* 2 %) 1 #(take 5 %) [1 2 4 8 16]
    inc 0 #(take 100 %) (take 100 (range))
    #(inc (mod % 3)) 1 #(take 9 %) (take 9 (cycle [1 2 3]))))
