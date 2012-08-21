(ns four-clojure-answers.problem-083-test
  (:use four-clojure-answers.problem-083
        clojure.test))

(deftest problem-083-test
  (testing "引数が全て true の場合、false を返す"
    (is (false? (answer true true true))))

  (testing "引数が全て false の場合、false を返す"
    (is (false? (answer false false))))

  (testing "引数に true と false の両方が含まれる場合、true を返す"
    (are [bools]
      (true? (apply answer bools))
      [true false]
      [false true false]
      [true true true false])))
