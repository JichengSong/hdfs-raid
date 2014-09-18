hdfs-raid
=========

Keeping three copies of the same data is very costly, especially when the size of storage is huge. One idea is to reduce the replication factor and do erasure coding of a set of blocks so that the over probability of failure of a block remains the same as before. Many forms of error-correcting codes are available, see http://en.wikipedia.org/wiki/Erasure_code. Also, recent research from CMU has described DiskReduce https://opencirrus.org/system/files/Gibson-OpenCirrus-June9-09.ppt. An idea is to discuss implementation strategies that are not part of base HDFS, but is a layer on top of HDFS.
