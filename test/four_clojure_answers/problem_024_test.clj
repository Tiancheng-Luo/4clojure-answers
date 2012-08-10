(ns four-clojure-answers.problem-024-test
  (:use four-clojure-answers.problem-024
        clojure.test))

(deftest problem-024-test
  (are [coll expected]
    (= (answer coll) expected)
    [1 2 3] 6
    (list 0 -2 5 5) 8
    #{4 2 1} 7
    '(0 0 -1) -1
    '(1 10 3) 14))
