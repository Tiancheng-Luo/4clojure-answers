(ns four-clojure-answers.problem-118)

(def answer
  (fn my-map [f coll]
    (lazy-seq
      (when-let [[x & more] (seq coll)]
        (cons (f x) (my-map f more))))))
