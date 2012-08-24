(ns four-clojure-answers.problem-096-test
  (:use four-clojure-answers.problem-096
        clojure.test))

(deftest problem-096-test
  (are [coll]
    (true? (answer coll))
    '(:a (:b nil nil) (:b nil nil))
    [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
       [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])

  (are [coll]
    (false? (answer coll))
    '(:a (:b nil nil) nil)
    [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
       [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]]
    [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] nil]] nil]]))
