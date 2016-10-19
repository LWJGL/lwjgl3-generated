/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyfd;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to <a href="https://sourceforge.net/projects/tinyfiledialogs/">tiny file dialogs</a>, a native dialog library with support for:
 * 
 * <ul>
 * <li>message / question</li>
 * <li>input / password</li>
 * <li>save file</li>
 * <li>open file & multiple files</li>
 * <li>select folder</li>
 * <li>color picker</li>
 * </ul>
 * 
 * <p>The dialogs can be forced into console mode.</p>
 */
public class TinyFileDialogs {

	static {
		Library.loadSystem(Platform.mapLibraryNameBundled("lwjgl_tinyfd"));
		tinyfd_winUtf8().put(0, 1);
	}

	protected TinyFileDialogs() {
		throw new UnsupportedOperationException();
	}

	// --- [ tinyfd_version ] ---

	private static native long ntinyfd_version();

	private static String tinyfd_version() {
		long __result = ntinyfd_version();
		return memASCII(__result);
	}

	/** The library version. */
	public static final String tinyfd_version = tinyfd_version();

	// --- [ tinyfd_winUtf8 ] ---

	private static native long ntinyfd_winUtf8();

	private static IntBuffer tinyfd_winUtf8() {
		long __result = ntinyfd_winUtf8();
		return memIntBuffer(__result, 1);
	}

	// --- [ tinyfd_forceConsole ] ---

	private static native long ntinyfd_forceConsole();

	private static IntBuffer tinyfd_forceConsole() {
		long __result = ntinyfd_forceConsole();
		return memIntBuffer(__result, 1);
	}

	/**
	 * Can be modified at run time.
	 * 
	 * <p>For unix & windows: 0 (graphic mode) or 1 (console mode).</p>
	 * 
	 * <p>0: try to use a graphic solution, if it fails then it uses console mode.
	 * 1: forces all dialogs into console mode even when the X server is present. It will use the package dialog or dialog.exe if installed. On windows it
	 * only makes sense for console applications.</p>
	 */
	public static final IntBuffer tinyfd_forceConsole = tinyfd_forceConsole();

	// --- [ tinyfd_response ] ---

	/** Unsafe version of: {@link #tinyfd_response response} */
	public static native long ntinyfd_response();

	/**
	 * If you pass "tinyfd_query" as {@code aTitle}, the functions will not display the dialogs but will fill {@code tinyfd_response} with the retain solution
	 * and return:
	 * 
	 * <p>Possible values for {@code tinyfd_response} are (all lowercase) for the graphic mode: windows applescript zenity zenity3 matedialog kdialog xdialog
	 * tkinter gdialog gxmessage xmessage</p>
	 * 
	 * <p>For the console mode: dialog whiptail basicinput</p>
	 */
	public static String tinyfd_response() {
		long __result = ntinyfd_response();
		return memUTF8(__result);
	}

	// --- [ tinyfd_messageBox ] ---

	/** Unsafe version of: {@link #tinyfd_messageBox messageBox} */
	public static native int ntinyfd_messageBox(long aTitle, long aMessage, long aDialogType, long aIconType, int aDefaultButton);

	/**
	 * Displays a message dialog.
	 *
	 * @param aTitle         the dialog title
	 * @param aMessage       the message. It may contain \n and \t characters.
	 * @param aDialogType    the dialog type. One of:<br><table><tr><td>"ok"</td><td>"okcancel"</td><td>"yesno"</td></tr></table>
	 * @param aIconType      the icon type. One of:<br><table><tr><td>"info"</td><td>"warning"</td><td>"error"</td><td>"question"</td></tr></table>
	 * @param aDefaultButton 0 for cancel/no, 1 for ok/yes
	 *
	 * @return 0 for cancel/no, 1 for ok/yes
	 */
	public static boolean tinyfd_messageBox(ByteBuffer aTitle, ByteBuffer aMessage, ByteBuffer aDialogType, ByteBuffer aIconType, boolean aDefaultButton) {
		if ( CHECKS ) {
			checkNT1(aTitle);
			checkNT1(aMessage);
			checkNT1(aDialogType);
			checkNT1(aIconType);
		}
		return ntinyfd_messageBox(memAddress(aTitle), memAddress(aMessage), memAddress(aDialogType), memAddress(aIconType), aDefaultButton ? 1 : 0) != 0;
	}

	/**
	 * Displays a message dialog.
	 *
	 * @param aTitle         the dialog title
	 * @param aMessage       the message. It may contain \n and \t characters.
	 * @param aDialogType    the dialog type. One of:<br><table><tr><td>"ok"</td><td>"okcancel"</td><td>"yesno"</td></tr></table>
	 * @param aIconType      the icon type. One of:<br><table><tr><td>"info"</td><td>"warning"</td><td>"error"</td><td>"question"</td></tr></table>
	 * @param aDefaultButton 0 for cancel/no, 1 for ok/yes
	 *
	 * @return 0 for cancel/no, 1 for ok/yes
	 */
	public static boolean tinyfd_messageBox(CharSequence aTitle, CharSequence aMessage, CharSequence aDialogType, CharSequence aIconType, boolean aDefaultButton) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer aTitleEncoded = stack.UTF8(aTitle);
			ByteBuffer aMessageEncoded = stack.UTF8(aMessage);
			ByteBuffer aDialogTypeEncoded = stack.ASCII(aDialogType);
			ByteBuffer aIconTypeEncoded = stack.ASCII(aIconType);
			return ntinyfd_messageBox(memAddress(aTitleEncoded), memAddress(aMessageEncoded), memAddress(aDialogTypeEncoded), memAddress(aIconTypeEncoded), aDefaultButton ? 1 : 0) != 0;
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ tinyfd_inputBox ] ---

	/** Unsafe version of: {@link #tinyfd_inputBox inputBox} */
	public static native long ntinyfd_inputBox(long aTitle, long aMessage, long aDefaultInput);

	/**
	 * Displays an input dialog.
	 *
	 * @param aTitle        the dialog title
	 * @param aMessage      the message. May NOT contain \n and \t characters on Windows.
	 * @param aDefaultInput if {@code NULL} it's a password box
	 *
	 * @return the input value or {@code NULL} on cancel
	 */
	public static String tinyfd_inputBox(ByteBuffer aTitle, ByteBuffer aMessage, ByteBuffer aDefaultInput) {
		if ( CHECKS ) {
			checkNT1(aTitle);
			checkNT1(aMessage);
			checkNT1Safe(aDefaultInput);
		}
		long __result = ntinyfd_inputBox(memAddress(aTitle), memAddress(aMessage), memAddressSafe(aDefaultInput));
		return memUTF8(__result);
	}

	/**
	 * Displays an input dialog.
	 *
	 * @param aTitle        the dialog title
	 * @param aMessage      the message. May NOT contain \n and \t characters on Windows.
	 * @param aDefaultInput if {@code NULL} it's a password box
	 *
	 * @return the input value or {@code NULL} on cancel
	 */
	public static String tinyfd_inputBox(CharSequence aTitle, CharSequence aMessage, CharSequence aDefaultInput) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer aTitleEncoded = stack.UTF8(aTitle);
			ByteBuffer aMessageEncoded = stack.UTF8(aMessage);
			ByteBuffer aDefaultInputEncoded = stack.UTF8(aDefaultInput);
			long __result = ntinyfd_inputBox(memAddress(aTitleEncoded), memAddress(aMessageEncoded), memAddressSafe(aDefaultInputEncoded));
			return memUTF8(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ tinyfd_saveFileDialog ] ---

	/**
	 * Unsafe version of: {@link #tinyfd_saveFileDialog saveFileDialog}
	 *
	 * @param aNumOfFilterPatterns the number of patterns in {@code aFilterPatterns}
	 */
	public static native long ntinyfd_saveFileDialog(long aTitle, long aDefaultPathAndFile, int aNumOfFilterPatterns, long aFilterPatterns, long aSingleFilterDescription);

	/**
	 * Displays a file save dialog.
	 *
	 * @param aTitle                   the dialog title
	 * @param aDefaultPathAndFile      the default path and/or file
	 * @param aFilterPatterns          an array of file type patterns ({@code NULL} or {"*.jpg","*.png"}
	 * @param aSingleFilterDescription {@code NULL} or "image files"
	 *
	 * @return the selected file path or {@code NULL} on cancel
	 */
	public static String tinyfd_saveFileDialog(ByteBuffer aTitle, ByteBuffer aDefaultPathAndFile, PointerBuffer aFilterPatterns, ByteBuffer aSingleFilterDescription) {
		if ( CHECKS ) {
			checkNT1(aTitle);
			checkNT1(aDefaultPathAndFile);
			checkNT1Safe(aSingleFilterDescription);
		}
		long __result = ntinyfd_saveFileDialog(memAddress(aTitle), memAddress(aDefaultPathAndFile), remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), memAddressSafe(aSingleFilterDescription));
		return memUTF8(__result);
	}

	/**
	 * Displays a file save dialog.
	 *
	 * @param aTitle                   the dialog title
	 * @param aDefaultPathAndFile      the default path and/or file
	 * @param aFilterPatterns          an array of file type patterns ({@code NULL} or {"*.jpg","*.png"}
	 * @param aSingleFilterDescription {@code NULL} or "image files"
	 *
	 * @return the selected file path or {@code NULL} on cancel
	 */
	public static String tinyfd_saveFileDialog(CharSequence aTitle, CharSequence aDefaultPathAndFile, PointerBuffer aFilterPatterns, CharSequence aSingleFilterDescription) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer aTitleEncoded = stack.UTF8(aTitle);
			ByteBuffer aDefaultPathAndFileEncoded = stack.UTF8(aDefaultPathAndFile);
			ByteBuffer aSingleFilterDescriptionEncoded = stack.UTF8(aSingleFilterDescription);
			long __result = ntinyfd_saveFileDialog(memAddress(aTitleEncoded), memAddress(aDefaultPathAndFileEncoded), remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), memAddressSafe(aSingleFilterDescriptionEncoded));
			return memUTF8(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ tinyfd_openFileDialog ] ---

	/**
	 * Unsafe version of: {@link #tinyfd_openFileDialog openFileDialog}
	 *
	 * @param aNumOfFilterPatterns the number of patterns in {@code aFilterPatterns}
	 */
	public static native long ntinyfd_openFileDialog(long aTitle, long aDefaultPathAndFile, int aNumOfFilterPatterns, long aFilterPatterns, long aSingleFilterDescription, int aAllowMultipleSelects);

	/**
	 * Displays a file open dialog.
	 *
	 * @param aTitle                   the dialog title
	 * @param aDefaultPathAndFile      the default path and/or file
	 * @param aFilterPatterns          an array of file type patterns ({@code NULL} or {"*.jpg","*.png"}
	 * @param aSingleFilterDescription {@code NULL} or "image files"
	 * @param aAllowMultipleSelects    if true, multiple selections are allowed
	 *
	 * @return the file(s) selected or {@code NULL} on cancel. In case of multiple files, the separator is '|'.
	 */
	public static String tinyfd_openFileDialog(ByteBuffer aTitle, ByteBuffer aDefaultPathAndFile, PointerBuffer aFilterPatterns, ByteBuffer aSingleFilterDescription, boolean aAllowMultipleSelects) {
		if ( CHECKS ) {
			checkNT1(aTitle);
			checkNT1(aDefaultPathAndFile);
			checkNT1Safe(aSingleFilterDescription);
		}
		long __result = ntinyfd_openFileDialog(memAddress(aTitle), memAddress(aDefaultPathAndFile), remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), memAddressSafe(aSingleFilterDescription), aAllowMultipleSelects ? 1 : 0);
		return memUTF8(__result);
	}

	/**
	 * Displays a file open dialog.
	 *
	 * @param aTitle                   the dialog title
	 * @param aDefaultPathAndFile      the default path and/or file
	 * @param aFilterPatterns          an array of file type patterns ({@code NULL} or {"*.jpg","*.png"}
	 * @param aSingleFilterDescription {@code NULL} or "image files"
	 * @param aAllowMultipleSelects    if true, multiple selections are allowed
	 *
	 * @return the file(s) selected or {@code NULL} on cancel. In case of multiple files, the separator is '|'.
	 */
	public static String tinyfd_openFileDialog(CharSequence aTitle, CharSequence aDefaultPathAndFile, PointerBuffer aFilterPatterns, CharSequence aSingleFilterDescription, boolean aAllowMultipleSelects) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer aTitleEncoded = stack.UTF8(aTitle);
			ByteBuffer aDefaultPathAndFileEncoded = stack.UTF8(aDefaultPathAndFile);
			ByteBuffer aSingleFilterDescriptionEncoded = stack.UTF8(aSingleFilterDescription);
			long __result = ntinyfd_openFileDialog(memAddress(aTitleEncoded), memAddress(aDefaultPathAndFileEncoded), remainingSafe(aFilterPatterns), memAddressSafe(aFilterPatterns), memAddressSafe(aSingleFilterDescriptionEncoded), aAllowMultipleSelects ? 1 : 0);
			return memUTF8(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ tinyfd_selectFolderDialog ] ---

	/** Unsafe version of: {@link #tinyfd_selectFolderDialog selectFolderDialog} */
	public static native long ntinyfd_selectFolderDialog(long aTitle, long aDefaultPath);

	/**
	 * Displays a folder selection dialog.
	 *
	 * @param aTitle       the dialog title
	 * @param aDefaultPath the default path
	 */
	public static String tinyfd_selectFolderDialog(ByteBuffer aTitle, ByteBuffer aDefaultPath) {
		if ( CHECKS ) {
			checkNT1(aTitle);
			checkNT1(aDefaultPath);
		}
		long __result = ntinyfd_selectFolderDialog(memAddress(aTitle), memAddress(aDefaultPath));
		return memUTF8(__result);
	}

	/**
	 * Displays a folder selection dialog.
	 *
	 * @param aTitle       the dialog title
	 * @param aDefaultPath the default path
	 */
	public static String tinyfd_selectFolderDialog(CharSequence aTitle, CharSequence aDefaultPath) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer aTitleEncoded = stack.UTF8(aTitle);
			ByteBuffer aDefaultPathEncoded = stack.UTF8(aDefaultPath);
			long __result = ntinyfd_selectFolderDialog(memAddress(aTitleEncoded), memAddress(aDefaultPathEncoded));
			return memUTF8(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ tinyfd_colorChooser ] ---

	/** Unsafe version of: {@link #tinyfd_colorChooser colorChooser} */
	public static native long ntinyfd_colorChooser(long aTitle, long aDefaultHexRGB, long aDefaultRGB, long aoResultRGB);

	/**
	 * Displays a color chooser dialog.
	 *
	 * @param aTitle         the dialog title
	 * @param aDefaultHexRGB {@code NULL} or "#FF0000"
	 * @param aDefaultRGB    { 0 , 255 , 255 }. Used only if {@code aDefaultHexRGB} is {@code NULL}.
	 * @param aoResultRGB    returns the selected color. {@code aDefaultRGB} and {@code aoResultRGB} can be the same array.
	 *
	 * @return the selected hexcolor as a string "#FF0000" or {@code NULL} on cancel
	 */
	public static String tinyfd_colorChooser(ByteBuffer aTitle, ByteBuffer aDefaultHexRGB, ByteBuffer aDefaultRGB, ByteBuffer aoResultRGB) {
		if ( CHECKS ) {
			checkNT1(aTitle);
			checkNT1Safe(aDefaultHexRGB);
			checkBufferSafe(aDefaultRGB, 3);
			checkBuffer(aoResultRGB, 3);
		}
		long __result = ntinyfd_colorChooser(memAddress(aTitle), memAddressSafe(aDefaultHexRGB), memAddressSafe(aDefaultRGB), memAddress(aoResultRGB));
		return memUTF8(__result);
	}

	/**
	 * Displays a color chooser dialog.
	 *
	 * @param aTitle         the dialog title
	 * @param aDefaultHexRGB {@code NULL} or "#FF0000"
	 * @param aDefaultRGB    { 0 , 255 , 255 }. Used only if {@code aDefaultHexRGB} is {@code NULL}.
	 * @param aoResultRGB    returns the selected color. {@code aDefaultRGB} and {@code aoResultRGB} can be the same array.
	 *
	 * @return the selected hexcolor as a string "#FF0000" or {@code NULL} on cancel
	 */
	public static String tinyfd_colorChooser(CharSequence aTitle, CharSequence aDefaultHexRGB, ByteBuffer aDefaultRGB, ByteBuffer aoResultRGB) {
		if ( CHECKS ) {
			checkBufferSafe(aDefaultRGB, 3);
			checkBuffer(aoResultRGB, 3);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer aTitleEncoded = stack.UTF8(aTitle);
			ByteBuffer aDefaultHexRGBEncoded = stack.ASCII(aDefaultHexRGB);
			long __result = ntinyfd_colorChooser(memAddress(aTitleEncoded), memAddressSafe(aDefaultHexRGBEncoded), memAddressSafe(aDefaultRGB), memAddress(aoResultRGB));
			return memUTF8(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

}