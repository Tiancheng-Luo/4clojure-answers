(ns four-clojure-answers.problem-046-test
  (:use four-clojure-answers.problem-046
        clojure.test))

(deftest problem-046-test
  (is (= 3 ((answer nth) 2 [1 2 3 4 5])))
  (is (= true ((answer >) 7 8)))
  (is (= 4 ((answer quot) 2 8)))
  (is (= [1 2 3] ((answer take) [1 2 3 4 5] 3))))
