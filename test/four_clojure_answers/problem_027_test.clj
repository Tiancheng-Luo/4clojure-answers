(ns four-clojure-answers.problem-027-test
  (:use four-clojure-answers.problem-027
        clojure.test))

(deftest problem-027-test
  (testing "coll が回文ならば true を返す"
    (are [coll]
      (answer coll)
      "racecar"
      [:foo :bar :foo]
      '(1 1 3 3 1 1)))

  (testing "coll が回文でなければ false を返す"
    (are [coll]
      (not (answer coll))
      '(1 2 3 4 5)
      '(:a :b :c))))
