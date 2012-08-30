(ns four-clojure-answers.problem-058-test
  (:use four-clojure-answers.problem-058
        clojure.test))

(deftest problem-058-test
  (are [fs xs expected]
    (= (apply (apply answer fs) xs) expected)
    [rest reverse] [[1 2 3 4]] [3 2 1]
    [(partial + 3) second] [[1 2 3 4]] 5
    [zero? #(mod % 8) +] [3 5 7 9] true
    [#(.toUpperCase %) #(apply str %) take] [5 "hello world"] "HELLO"))
