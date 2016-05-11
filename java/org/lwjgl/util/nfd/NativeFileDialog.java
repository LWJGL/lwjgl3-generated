/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to <a href="https://github.com/mlabbe/nativefiledialog">Native File Dialog</a>, a tiny, neat C library that portably invokes native file open
 * and save dialogs. Write dialog code once and have it pop up native dialogs on all supported platforms.
 * 
 * <h3>Usage</h3>
 * 
 * <ul>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/demo/nfd/HelloNFD.java#L104">Single file open dialog</a></li>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/demo/nfd/HelloNFD.java#L126">Multiple file open dialog</a></li>
 * <li><a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/demo/nfd/HelloNFD.java#L151">Save dialog</a></li>
 * </ul>
 * 
 * <h3>File Filter Syntax</h3>
 * 
 * <p>There is a form of file filtering in every file dialog, but no consistent means of supporting it. NFD provides support for filtering files by groups of
 * extensions, providing its own descriptions (where applicable) for the extensions.</p>
 * 
 * <p>A wildcard filter is always added to every dialog.</p>
 * 
 * <p>Separators:</p>
 * 
 * <ul>
 * <li><i>;</i> Begin a new filter.</li>
 * <li><i>,</i> Add a separate type to the filter.</li>
 * </ul>
 * 
 * <p>Examples:</p>
 * 
 * <ul>
 * <li><i>txt</i> The default filter is for text files. There is a wildcard option in a dropdown.</li>
 * <li><i>png,jpg;psd</i> The default filter is for png and jpg files. A second filter is available for psd files. There is a wildcard option in a dropdown.</li>
 * <li>{@code NULL} Wildcard only.</li>
 * </ul>
 * 
 * <h3>Known Limitations</h3>
 * 
 * <ul>
 * <li>No support for Windows XP's legacy dialogs such as GetOpenFileName.</li>
 * <li>No support for file filter names -- ex: "Image Files" (*.png, *.jpg). Nameless filters are supported, though.</li>
 * <li>No support for selecting folders instead of files.</li>
 * <li>On Linux, GTK+ cannot be uninitialized to save memory. Launching a file dialog costs memory.</li>
 * </ul>
 */
public class NativeFileDialog {

	/** Programmatic error. */
	public static final int NFD_ERROR = 0;

	/** User pressed okay, or successful return. */
	public static final int NFD_OKAY = 1;

	/** User pressed cancel. */
	public static final int NFD_CANCEL = 2;

	static { Library.initialize(); }

	static { MemoryUtil.getAllocator(); }

	protected NativeFileDialog() {
		throw new UnsupportedOperationException();
	}

	// --- [ NFD_OpenDialog ] ---

	/**
	 * Launches a single file open dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
	 * needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPath     returns the selected file path
	 */
	public static native int nNFD_OpenDialog(long filterList, long defaultPath, long outPath);

	/**
	 * Launches a single file open dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
	 * needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPath     returns the selected file path
	 */
	public static int NFD_OpenDialog(ByteBuffer filterList, ByteBuffer defaultPath, PointerBuffer outPath) {
		if ( CHECKS ) {
			if ( filterList != null ) checkNT1(filterList);
			if ( defaultPath != null ) checkNT1(defaultPath);
			checkBuffer(outPath, 1);
		}
		return nNFD_OpenDialog(memAddressSafe(filterList), memAddressSafe(defaultPath), memAddress(outPath));
	}

	/**
	 * Launches a single file open dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
	 * needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPath     returns the selected file path
	 */
	public static int NFD_OpenDialog(CharSequence filterList, CharSequence defaultPath, PointerBuffer outPath) {
		if ( CHECKS )
			checkBuffer(outPath, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filterListEncoded = stack.UTF8(filterList);
			ByteBuffer defaultPathEncoded = stack.UTF8(defaultPath);
			return nNFD_OpenDialog(memAddressSafe(filterListEncoded), memAddressSafe(defaultPathEncoded), memAddress(outPath));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ NFD_OpenDialogMultiple ] ---

	/**
	 * Launches a multiple file open dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPaths} will be filled with information about the selected file or files. The user must free that information with
	 * {@link #NFD_PathSet_Free PathSet_Free} when it is no longer needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPaths    a path set that will be filled with the selected files
	 */
	public static native int nNFD_OpenDialogMultiple(long filterList, long defaultPath, long outPaths);

	/**
	 * Launches a multiple file open dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPaths} will be filled with information about the selected file or files. The user must free that information with
	 * {@link #NFD_PathSet_Free PathSet_Free} when it is no longer needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPaths    a path set that will be filled with the selected files
	 */
	public static int NFD_OpenDialogMultiple(ByteBuffer filterList, ByteBuffer defaultPath, NFDPathSet outPaths) {
		if ( CHECKS ) {
			if ( filterList != null ) checkNT1(filterList);
			if ( defaultPath != null ) checkNT1(defaultPath);
		}
		return nNFD_OpenDialogMultiple(memAddressSafe(filterList), memAddressSafe(defaultPath), outPaths.address());
	}

	/**
	 * Launches a multiple file open dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPaths} will be filled with information about the selected file or files. The user must free that information with
	 * {@link #NFD_PathSet_Free PathSet_Free} when it is no longer needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPaths    a path set that will be filled with the selected files
	 */
	public static int NFD_OpenDialogMultiple(CharSequence filterList, CharSequence defaultPath, NFDPathSet outPaths) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filterListEncoded = stack.UTF8(filterList);
			ByteBuffer defaultPathEncoded = stack.UTF8(defaultPath);
			return nNFD_OpenDialogMultiple(memAddressSafe(filterListEncoded), memAddressSafe(defaultPathEncoded), outPaths.address());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ NFD_SaveDialog ] ---

	/**
	 * Launches a save dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
	 * needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPath     returns the selected file path
	 */
	public static native int nNFD_SaveDialog(long filterList, long defaultPath, long outPath);

	/**
	 * Launches a save dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
	 * needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPath     returns the selected file path
	 */
	public static int NFD_SaveDialog(ByteBuffer filterList, ByteBuffer defaultPath, PointerBuffer outPath) {
		if ( CHECKS ) {
			if ( filterList != null ) checkNT1(filterList);
			if ( defaultPath != null ) checkNT1(defaultPath);
			checkBuffer(outPath, 1);
		}
		return nNFD_SaveDialog(memAddressSafe(filterList), memAddressSafe(defaultPath), memAddress(outPath));
	}

	/**
	 * Launches a save dialog.
	 * 
	 * <p>If {@link #NFD_OKAY OKAY} is returned, {@code outPath} will contain a pointer to a UTF-8 encoded string. The user must free the string with {@link #NFD_Free Free} when it is no longer
	 * needed.</p>
	 *
	 * @param filterList  an optional filter list
	 * @param defaultPath an optional default path
	 * @param outPath     returns the selected file path
	 */
	public static int NFD_SaveDialog(CharSequence filterList, CharSequence defaultPath, PointerBuffer outPath) {
		if ( CHECKS )
			checkBuffer(outPath, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filterListEncoded = stack.UTF8(filterList);
			ByteBuffer defaultPathEncoded = stack.UTF8(defaultPath);
			return nNFD_SaveDialog(memAddressSafe(filterListEncoded), memAddressSafe(defaultPathEncoded), memAddress(outPath));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ NFD_GetError ] ---

	/** Returns the last error. */
	public static native long nNFD_GetError();

	/** Returns the last error. */
	public static String NFD_GetError() {
		long __result = nNFD_GetError();
		return memASCII(__result);
	}

	// --- [ NFD_PathSet_GetCount ] ---

	/**
	 * Returns the number of entries stored in {@code pathSet}.
	 *
	 * @param pathSet the path set to query
	 */
	public static native long nNFD_PathSet_GetCount(long pathSet);

	/**
	 * Returns the number of entries stored in {@code pathSet}.
	 *
	 * @param pathSet the path set to query
	 */
	public static long NFD_PathSet_GetCount(NFDPathSet pathSet) {
		return nNFD_PathSet_GetCount(pathSet.address());
	}

	// --- [ NFD_PathSet_GetPath ] ---

	/**
	 * Returns the UTF-8 path at offset {@code index}.
	 *
	 * @param pathSet the path set to query
	 * @param index   the path offset
	 */
	public static native long nNFD_PathSet_GetPath(long pathSet, long index);

	/**
	 * Returns the UTF-8 path at offset {@code index}.
	 *
	 * @param pathSet the path set to query
	 * @param index   the path offset
	 */
	public static String NFD_PathSet_GetPath(NFDPathSet pathSet, long index) {
		long __result = nNFD_PathSet_GetPath(pathSet.address(), index);
		return memUTF8(__result);
	}

	// --- [ NFD_PathSet_Free ] ---

	/**
	 * Frees the contents of the specified path set.
	 *
	 * @param pathSet the path set
	 */
	public static native void nNFD_PathSet_Free(long pathSet);

	/**
	 * Frees the contents of the specified path set.
	 *
	 * @param pathSet the path set
	 */
	public static void NFD_PathSet_Free(NFDPathSet pathSet) {
		nNFD_PathSet_Free(pathSet.address());
	}

	// --- [ NFD_Free ] ---

	/**
	 * Frees memory allocated by NativeFileDialog.
	 *
	 * @param outPath the string to free
	 */
	public static native void nNFD_Free(long outPath);

	/**
	 * Frees memory allocated by NativeFileDialog.
	 *
	 * @param outPath the string to free
	 */
	public static void NFD_Free(ByteBuffer outPath) {
		nNFD_Free(memAddress(outPath));
	}

}