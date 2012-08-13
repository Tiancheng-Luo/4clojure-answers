(ns four-clojure-answers.problem-039-test
  (:use four-clojure-answers.problem-039
        clojure.test))

(deftest problem-039-test
  (are [colls expected]
    (= (apply answer colls) expected)
    [[1 2 3] [:a :b :c]] '(1 :a 2 :b 3 :c)
    [[1 2] [3 4 5 6]] '(1 3 2 4)
    [[1 2 3 4] [5]] [1 5]
    [[30 20] [25 15]] [30 25 20 15]))
