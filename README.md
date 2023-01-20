# java 领域建模开发实践
- 基本实现领域建模的方式开发，当然实现的好与不好另说
- 所有的业务应该被分解成一个个模型，比如商品，分类，订单等等
- 不同的业务对应着不同的模型操作，不同模型操作的组合实现完整业务逻辑
- 比如下单，商品模型减库存，订单模型新建订单，地址模型记录收货地址

# 说明
- 为了区分是模型中的方法，也为了避免与实体类中的方法重名所有模型方法都加了 $ 前缀
- 所有业务相关的模型的代码都应该写在com/oop/oop/model下，Service中只是对模型的操作进行组织和支配
- 模型的复用度极高，除了在业务代码中，其他场景下，拿到模型一样可以操作，比如消费队列中或异步任务

# 改变了什么
- 转变了开发者的角色，从一个流水线工人转变为一个指挥者
- 排查问题更容易，一个个模型就像一个个车间，哪里出问题很容易找到
- 代码的组织更有逻辑性，每个模型只干每个模型的事

# 建表语句

- 数据库 mysql5.7

```
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL,
  `name` varchar(128) COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of category
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES (1, '分类1');
INSERT INTO `category` VALUES (2, '分类2');
COMMIT;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL,
  `category` int(11) DEFAULT NULL,
  `goods_name` varchar(128) COLLATE utf8mb4_bin NOT NULL,
  `goods_images` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `goods_price` int(11) NOT NULL,
  `is_up` int(11) NOT NULL,
  `create_time` datetime(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of goods
-- ----------------------------
BEGIN;
INSERT INTO `goods` VALUES (1, 1, '苹果手机', '/56432453.png', 5899, 0, '2023-01-19 10:25:11.516497');
INSERT INTO `goods` VALUES (2, 2, '测试数据', '/3543432HJG.png', 223, 1, '2023-01-20 10:55:53.915392');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
```