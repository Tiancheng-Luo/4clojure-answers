(ns four-clojure-answers.problem-147-test
  (:use four-clojure-answers.problem-147
        clojure.test))

(deftest problem-147-test
  (is (= (second (answer [2 3 2])) [2 5 5 2]))
  (is (= (take 5 (answer [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]]))
  (is (= (take 2 (answer [3 1 2])) [[3 1 2] [3 4 3 2]]))
  (is (= (take 100 (answer [2 4 2])) (rest (take 101 (answer [2 2]))))))
