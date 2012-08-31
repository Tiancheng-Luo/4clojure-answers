(ns four-clojure-answers.problem-069)

(def answer-a
  (fn [f & ms]
    (reduce
      (fn [r [k v]]
        (if (contains? r k)
          (assoc r k (f (r k) v))
          (assoc r k v)))
      {}
      (apply concat ms))))

(def answer-b
  (fn [f & ms]
    (->> ms
      (apply concat)
      (group-by key)
      (map (fn [[k vs]] [k (reduce f (map val vs))]))
      (into {}))))
