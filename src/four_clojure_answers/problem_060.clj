(ns four-clojure-answers.problem-060)

(def answer
  (fn my-reductions
    ([f coll]
     (my-reductions f (first coll) (rest coll)))
    ([f init coll]
     (cons init
           (lazy-seq
             (when-let [[x & more] (seq coll)]
               (my-reductions f (f init x) more)))))))
