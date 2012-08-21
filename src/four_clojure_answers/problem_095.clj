(ns four-clojure-answers.problem-095)

(def answer
  (letfn [(binary-tree?  [t]
            (and (= (count t) 3)
                 (every? node? (rest t))))
          (node? [x]
            (or (nil? x)
                (and (coll? x)
                     (binary-tree? x))))]
    binary-tree?))
