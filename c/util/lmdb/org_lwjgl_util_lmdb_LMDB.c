/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4710 4711))
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4172 4701 4706))
#endif
#define MDB_DEVEL 2
#include "lmdb.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1version__JJJ(JNIEnv *__env, jclass clazz, jlong majorAddress, jlong minorAddress, jlong patchAddress) {
	int *major = (int *)(intptr_t)majorAddress;
	int *minor = (int *)(intptr_t)minorAddress;
	int *patch = (int *)(intptr_t)patchAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)mdb_version(major, minor, patch);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1strerror(JNIEnv *__env, jclass clazz, jint err) {
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)mdb_strerror(err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1create(JNIEnv *__env, jclass clazz, jlong envAddress) {
	MDB_env **env = (MDB_env **)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_create(env);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1open(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress, jint flags, jint mode) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	const char *path = (const char *)(intptr_t)pathAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_open(env, path, flags, mode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	const char *path = (const char *)(intptr_t)pathAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_copy(env, path);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy2(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress, jint flags) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	const char *path = (const char *)(intptr_t)pathAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_copy2(env, path, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1stat(JNIEnv *__env, jclass clazz, jlong envAddress, jlong statAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	MDB_stat *stat = (MDB_stat *)(intptr_t)statAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_stat(env, stat);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1info(JNIEnv *__env, jclass clazz, jlong envAddress, jlong statAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	MDB_envinfo *stat = (MDB_envinfo *)(intptr_t)statAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_info(env, stat);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1sync(JNIEnv *__env, jclass clazz, jlong envAddress, jint force) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_sync(env, force);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1close(JNIEnv *__env, jclass clazz, jlong envAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	mdb_env_close(env);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1flags(JNIEnv *__env, jclass clazz, jlong envAddress, jint flags, jint onoff) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_set_flags(env, flags, onoff);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong flagsAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	unsigned int *flags = (unsigned int *)(intptr_t)flagsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_get_flags(env, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1path(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	const char **path = (const char **)(intptr_t)pathAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_get_path(env, path);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1mapsize(JNIEnv *__env, jclass clazz, jlong envAddress, jlong size) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_set_mapsize(env, (mdb_size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxreaders(JNIEnv *__env, jclass clazz, jlong envAddress, jint readers) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_set_maxreaders(env, readers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong readersAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	unsigned int *readers = (unsigned int *)(intptr_t)readersAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_get_maxreaders(env, readers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxdbs(JNIEnv *__env, jclass clazz, jlong envAddress, jint dbs) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_set_maxdbs(env, dbs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxkeysize(JNIEnv *__env, jclass clazz, jlong envAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_get_maxkeysize(env);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1userctx(JNIEnv *__env, jclass clazz, jlong envAddress, jlong ctxAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	void *ctx = (void *)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_env_set_userctx(env, ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1userctx(JNIEnv *__env, jclass clazz, jlong envAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)mdb_env_get_userctx(env);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1begin(JNIEnv *__env, jclass clazz, jlong envAddress, jlong parentAddress, jint flags, jlong txnAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	MDB_txn *parent = (MDB_txn *)(intptr_t)parentAddress;
	MDB_txn **txn = (MDB_txn **)(intptr_t)txnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_txn_begin(env, parent, flags, txn);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1env(JNIEnv *__env, jclass clazz, jlong txnAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)mdb_txn_env(txn);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1id(JNIEnv *__env, jclass clazz, jlong txnAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)mdb_txn_id(txn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1commit(JNIEnv *__env, jclass clazz, jlong txnAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_txn_commit(txn);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1abort(JNIEnv *__env, jclass clazz, jlong txnAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	UNUSED_PARAMS(__env, clazz)
	mdb_txn_abort(txn);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1reset(JNIEnv *__env, jclass clazz, jlong txnAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	UNUSED_PARAMS(__env, clazz)
	mdb_txn_reset(txn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1renew(JNIEnv *__env, jclass clazz, jlong txnAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_txn_renew(txn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJIJ(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong nameAddress, jint flags, jlong dbiAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	MDB_dbi *dbi = (MDB_dbi *)(intptr_t)dbiAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_dbi_open(txn, name, flags, dbi);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1stat(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong statAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_stat *stat = (MDB_stat *)(intptr_t)statAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_stat(txn, dbi, stat);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JIJ(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong flagsAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	unsigned int *flags = (unsigned int *)(intptr_t)flagsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_dbi_flags(txn, dbi, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1close(JNIEnv *__env, jclass clazz, jlong envAddress, jint dbi) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAMS(__env, clazz)
	mdb_dbi_close(env, dbi);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1drop(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jint del) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_drop(txn, dbi, del);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1compare(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cmpAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_cmp_func *cmp = (MDB_cmp_func *)(intptr_t)cmpAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_set_compare(txn, dbi, cmp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1dupsort(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cmpAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_cmp_func *cmp = (MDB_cmp_func *)(intptr_t)cmpAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_set_dupsort(txn, dbi, cmp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relfunc(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong relAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_rel_func *rel = (MDB_rel_func *)(intptr_t)relAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_set_relfunc(txn, dbi, rel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relctx(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong ctxAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	void *ctx = (void *)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_set_relctx(txn, dbi, ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1get(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
	MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_get(txn, dbi, key, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1put(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress, jint flags) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
	MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_put(txn, dbi, key, data, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1del(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
	MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_del(txn, dbi, key, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1open(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cursorAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_cursor **cursor = (MDB_cursor **)(intptr_t)cursorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_cursor_open(txn, dbi, cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1close(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
	MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
	UNUSED_PARAMS(__env, clazz)
	mdb_cursor_close(cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1renew(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong cursorAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_cursor_renew(txn, cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1txn(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
	MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)mdb_cursor_txn(cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1dbi(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
	MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_cursor_dbi(cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1get(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong keyAddress, jlong dataAddress, jint op) {
	MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
	MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
	MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_cursor_get(cursor, key, data, op);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1put(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong keyAddress, jlong dataAddress, jint flags) {
	MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
	MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
	MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_cursor_put(cursor, key, data, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1del(JNIEnv *__env, jclass clazz, jlong cursorAddress, jint flags) {
	MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_cursor_del(cursor, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1count(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong countpAddress) {
	MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
	mdb_size_t *countp = (mdb_size_t *)(intptr_t)countpAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_cursor_count(cursor, countp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cmp(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong aAddress, jlong bAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	const MDB_val *a = (const MDB_val *)(intptr_t)aAddress;
	const MDB_val *b = (const MDB_val *)(intptr_t)bAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_cmp(txn, dbi, a, b);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dcmp(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong aAddress, jlong bAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	const MDB_val *a = (const MDB_val *)(intptr_t)aAddress;
	const MDB_val *b = (const MDB_val *)(intptr_t)bAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_dcmp(txn, dbi, a, b);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1list(JNIEnv *__env, jclass clazz, jlong envAddress, jlong funcAddress, jlong ctxAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	MDB_msg_func *func = (MDB_msg_func *)(intptr_t)funcAddress;
	void *ctx = (void *)(intptr_t)ctxAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_reader_list(env, func, ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong deadAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	int *dead = (int *)(intptr_t)deadAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)mdb_reader_check(env, dead);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1version___3I_3I_3I(JNIEnv *__env, jclass clazz, jintArray majorAddress, jintArray minorAddress, jintArray patchAddress) {
	jlong __result;
	jint *major = majorAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, majorAddress, 0);
	jint *minor = minorAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, minorAddress, 0);
	jint *patch = patchAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, patchAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jlong)(intptr_t)mdb_version((int *)major, (int *)minor, (int *)patch);
	if ( patch != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, patchAddress, patch, 0);
	if ( minor != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, minorAddress, minor, 0);
	if ( major != NULL ) (*__env)->ReleasePrimitiveArrayCritical(__env, majorAddress, major, 0);
	return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1version___3I_3I_3I(jint major__length, jint* major, jint minor__length, jint* minor, jint patch__length, jint* patch) {
	UNUSED_PARAM(major__length)
	UNUSED_PARAM(minor__length)
	UNUSED_PARAM(patch__length)
	return (jlong)(intptr_t)mdb_version((int *)major, (int *)minor, (int *)patch);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray flagsAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	jint __result;
	jint *flags = (*__env)->GetPrimitiveArrayCritical(__env, flagsAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)mdb_env_get_flags(env, (unsigned int *)flags);
	(*__env)->ReleasePrimitiveArrayCritical(__env, flagsAddress, flags, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__J_3I(jlong envAddress, jint flags__length, jint* flags) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAM(flags__length)
	return (jint)mdb_env_get_flags(env, (unsigned int *)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray readersAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	jint __result;
	jint *readers = (*__env)->GetPrimitiveArrayCritical(__env, readersAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)mdb_env_get_maxreaders(env, (unsigned int *)readers);
	(*__env)->ReleasePrimitiveArrayCritical(__env, readersAddress, readers, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__J_3I(jlong envAddress, jint readers__length, jint* readers) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAM(readers__length)
	return (jint)mdb_env_get_maxreaders(env, (unsigned int *)readers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJI_3I(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong nameAddress, jint flags, jintArray dbiAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	jint __result;
	jint *dbi = (*__env)->GetPrimitiveArrayCritical(__env, dbiAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)mdb_dbi_open(txn, name, flags, (MDB_dbi *)dbi);
	(*__env)->ReleasePrimitiveArrayCritical(__env, dbiAddress, dbi, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJI_3I(jlong txnAddress, jlong nameAddress, jint flags, jint dbi__length, jint* dbi) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAM(dbi__length)
	return (jint)mdb_dbi_open(txn, name, flags, (MDB_dbi *)dbi);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JI_3I(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jintArray flagsAddress) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	jint __result;
	jint *flags = (*__env)->GetPrimitiveArrayCritical(__env, flagsAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)mdb_dbi_flags(txn, dbi, (unsigned int *)flags);
	(*__env)->ReleasePrimitiveArrayCritical(__env, flagsAddress, flags, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JI_3I(jlong txnAddress, jint dbi, jint flags__length, jint* flags) {
	MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
	UNUSED_PARAM(flags__length)
	return (jint)mdb_dbi_flags(txn, dbi, (unsigned int *)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray deadAddress) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	jint __result;
	jint *dead = (*__env)->GetPrimitiveArrayCritical(__env, deadAddress, 0);
	UNUSED_PARAMS(__env, clazz)
	__result = (jint)mdb_reader_check(env, (int *)dead);
	(*__env)->ReleasePrimitiveArrayCritical(__env, deadAddress, dead, 0);
	return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__J_3I(jlong envAddress, jint dead__length, jint* dead) {
	MDB_env *env = (MDB_env *)(intptr_t)envAddress;
	UNUSED_PARAM(dead__length)
	return (jint)mdb_reader_check(env, (int *)dead);
}

EXTERN_C_EXIT
