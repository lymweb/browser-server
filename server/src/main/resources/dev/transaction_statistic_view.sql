CREATE VIEW transaction_count_view AS
SELECT tr.`chain_id`, COUNT(0) AS transaction_count FROM `transaction` tr WHERE tr.`timestamp` >= DATE_SUB(NOW(),INTERVAL 1 DAY) AND tr.`timestamp` <= NOW() GROUP BY tr.`chain_id`;