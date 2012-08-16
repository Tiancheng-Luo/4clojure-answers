(ns four-clojure-answers.problem-062)

(def answer
  (fn my-iterate [f x]
    (lazy-seq
      (cons x (my-iterate f (f x))))))
