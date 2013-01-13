(ns four-clojure-answers.problem-171)

(def answer
  (fn [s]
    (->> s
      set
      sort
      (reduce (fn [r v]
                (let [[start end] (last r)]
                  (if (= end (dec v))
                    (conj (vec (drop-last r)) [start v])
                    (conj r [v v]))))
              []))))
