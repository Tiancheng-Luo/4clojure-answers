(ns four-clojure-answers.problem-060-test
  (:use four-clojure-answers.problem-060
        clojure.test))

(deftest problem-060-test
  (is (= (take 5 (answer + (range))) [0 1 3 6 10]))
  (is (= (answer conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
  (is (= (last (answer * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)))
