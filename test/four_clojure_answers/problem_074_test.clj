(ns four-clojure-answers.problem-074-test
  (:use four-clojure-answers.problem-074
        clojure.test))

(deftest problem-074-test
  (are [s expected]
    (= (answer s) expected)
    "4,5,6,7,8,9" "4,9"
    "15,16,25,36,37" "16,25,36"))
