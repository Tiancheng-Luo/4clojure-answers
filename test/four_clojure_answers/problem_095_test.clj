(ns four-clojure-answers.problem-095-test
  (:use four-clojure-answers.problem-095
        clojure.test))

(deftest problem-095-test
  (testing "tree が二分木の場合、true を返す"
    (are [tree]
      (true? (answer tree))
      '(:a (:b nil nil) nil)
      [1 nil [2 [3 nil nil] [4 nil nil]]]
      [1 [2 [3 [4 nil nil] nil] nil] nil]))

  (testing "tree が二分木でない場合、false を返す"
    (are [tree]
      (false? (answer tree))
      '(:a (:b nil nil))
      [1 [2 nil nil] [3 nil nil] [4 nil nil]]
      [1 [2 [3 [4 false nil] nil] nil] nil]
      '(:a nil ()))))
