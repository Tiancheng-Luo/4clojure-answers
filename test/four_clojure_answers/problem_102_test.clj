(ns four-clojure-answers.problem-102-test
  (:use four-clojure-answers.problem-102
        clojure.test))

(deftest problem-102-test
  (are [s expected]
    (= (answer s) expected)
    "something" "something"
    "multi-word-key" "multiWordKey"
    "leaveMeAlone"  "leaveMeAlone"))
