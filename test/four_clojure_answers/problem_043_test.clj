(ns four-clojure-answers.problem-043-test
  (:use four-clojure-answers.problem-043
        clojure.test))

(deftest problem-043-test
  (are [coll n expected]
    (= (answer coll n) expected)
    [1 2 3 4 5 6] 2 '((1 3 5) (2 4 6))
    (range 9) 3 '((0 3 6) (1 4 7) (2 5 8))
    (range 10) 5 '((0 5) (1 6) (2 7) (3 8) (4 9))))
