(ns four-clojure-answers.problem-097)

(def answer
  (fn [n]
    (nth
      (iterate
        (fn [nums]
          (vec
            (map + (conj nums 0) (cons 0 nums))))
        [1])
      (dec n))))
