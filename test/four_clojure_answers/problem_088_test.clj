(ns four-clojure-answers.problem-088-test
  (:use four-clojure-answers.problem-088
        clojure.test))

(deftest problem-088-test
  (are [s1 s2 expected]
    (= (answer s1 s2) expected)
    #{1 2 3 4 5 6} #{1 3 5 7} #{2 4 6 7}
    #{:a :b :c} #{} #{:a :b :c}
    #{} #{4 5 6} #{4 5 6}
    #{[1 2] [2 3]} #{[2 3] [3 4]} #{[1 2] [3 4]}))
