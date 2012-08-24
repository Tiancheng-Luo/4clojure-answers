(ns four-clojure-answers.problem-097-test
  (:use four-clojure-answers.problem-097
        clojure.test))

(deftest problem-097-test
  (are [n expected]
    (= (answer n) expected)
    1 [1]
    11 [1 10 45 120 210 252 210 120 45 10 1])

  (is (= (map answer (range 1 6))
         [    [1]
             [1 1]
            [1 2 1]
           [1 3 3 1]
          [1 4 6 4 1]])))
